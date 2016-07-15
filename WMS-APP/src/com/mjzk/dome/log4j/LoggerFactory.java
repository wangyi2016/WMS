package com.mjzk.dome.log4j;

import java.io.IOException;
import java.util.Enumeration;

import org.apache.log4j.Appender;
import org.apache.log4j.Logger;

/**
 * 日志工厂
 * 
 * @author XieChangJiang
 *
 */
public class LoggerFactory {

	/**
	 * log4j映射getLoger("customLogger") 的名称
	 */
	public static final String prefix = "customeLogger";

	/**
	 * 父Logger,Log4j中的Logger 有继承关系
	 */
	public static Logger parentLogger;

	static {
		parentLogger = Logger.getLogger(prefix);
	}

	public static Logger getLogger() {

		Logger logger = Logger.getLogger(prefix + Thread.currentThread().getName());
		addAppender(logger, Thread.currentThread().getName());
		System.out.println("----------------------------the thread name is: " + Thread.currentThread().getName());
		return logger;
	}

	/**
	 * 添加Appender
	 * 
	 * @param logger
	 * @param threadName
	 */
	private static void addAppender(Logger logger, String threadName) {
		@SuppressWarnings("unchecked")
		Enumeration<Appender> appends = parentLogger
				.getAllAppenders(); /** 获取log4j日志文件中的所有 appender **/

		if (!logger.getAllAppenders().hasMoreElements()) {
			while (appends.hasMoreElements()) {
				Appender appender = (Appender) appends.nextElement();
				if (appender instanceof DailyRollingAppenderDecorator) {

					/**
					 * 如果appender的类型为自定义的 ThreadDailyRollingAppenderDecorator
					 **/
					DailyRollingAppenderDecorator myappender = (DailyRollingAppenderDecorator) appender;
					try {
						logger.addAppender(new DailyRollingAppenderDecorator(myappender, threadName));
					} catch (IOException e) {
						e.printStackTrace();
					}
					continue;
				}
				logger.addAppender(appender);
			}
		}
	}
}
