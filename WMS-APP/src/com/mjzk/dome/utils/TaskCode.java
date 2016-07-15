package com.mjzk.dome.utils;

import java.util.UUID;

/**
 * 通过uuid生成任务唯一编码
 * 
 * @author XieChangJiang
 *
 */
public class TaskCode {

	public static String getTaskCode() {
		UUID uuid = UUID.randomUUID();
		String code = uuid.toString().substring(0, 8);
		return code;
	}
}
