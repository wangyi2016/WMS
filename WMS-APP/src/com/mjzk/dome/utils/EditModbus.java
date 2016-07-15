/**
 * 
 */
package com.mjzk.dome.utils;

import com.mjzk.dome.common.Common;
import com.serotonin.modbus4j.ModbusFactory;
import com.serotonin.modbus4j.ModbusMaster;
import com.serotonin.modbus4j.code.DataType;
import com.serotonin.modbus4j.code.RegisterRange;
import com.serotonin.modbus4j.exception.ErrorResponseException;
import com.serotonin.modbus4j.exception.ModbusInitException;
import com.serotonin.modbus4j.exception.ModbusTransportException;
import com.serotonin.modbus4j.ip.IpParameters;
import com.serotonin.modbus4j.locator.NumericLocator;
import com.serotonin.modbus4j.msg.WriteRegistersRequest;
import com.serotonin.modbus4j.msg.WriteRegistersResponse;

/**
 * @author wangyi 2016年7月12日 
 *
 */
public class EditModbus {
	public static int[] test(int slaveId, int start,int end,String ip) {
		IpParameters ipParameters = new IpParameters();

		ipParameters.setHost(ip);
		ipParameters.setPort(Common.PORT);
		ipParameters.setEncapsulated(false);

		ModbusFactory modbusFactory = new ModbusFactory();

		ModbusMaster master = modbusFactory
				.createTcpMaster(ipParameters, false);
		master.setTimeout(8000);
		master.setRetries(0);
		int[] a = null;
		try {
			master.init();
			a=read(master, slaveId, start, end);
			
			//writeTest(master, 1, 5, new short[]{24,12524,134,144});
		} catch (ModbusInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}
	
	public static void testwrite(int slaveId, int start,short b[],String ip) {
		IpParameters ipParameters = new IpParameters();

		ipParameters.setHost(ip);
		ipParameters.setPort(Common.PORT);
		ipParameters.setEncapsulated(false);

		ModbusFactory modbusFactory = new ModbusFactory();

		ModbusMaster master = modbusFactory
				.createTcpMaster(ipParameters, false);
		master.setTimeout(8000);
		master.setRetries(0);
		try {
			master.init();
			//a=read(master, 1, 0, 9);
			
			writeTest(master, slaveId, start,b);
		} catch (ModbusInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static int[] read(ModbusMaster master, int slaveId, int start,
			int end) {

		Object val;
		int [] vals=new int[end-start+1];
		try {
			for (int i = start; i <= end; i++) {
				NumericLocator el = new NumericLocator(1,
						RegisterRange.HOLDING_REGISTER, i,
						DataType.TWO_BYTE_INT_SIGNED);
				val = (Object) (master.getValue(el));
				vals[i-start]=Integer.parseInt(val.toString());
				
			}
		} catch (ModbusTransportException e1) {
			return null;
		} catch (ErrorResponseException e1) {
			return null;
		} catch (Exception e) {
			return null;
		}
		return vals;
	}
/**
 * 
 * @param master
 * @param slaveId
 * @param start 起始地址
 * @param vals 写的数据
 */
	public static void writeTest(ModbusMaster master, int slaveId, int start,
			short[] vals) {
		try {
			WriteRegistersRequest request = new WriteRegistersRequest(1, start,
					vals);
			WriteRegistersResponse response = (WriteRegistersResponse) master
					.send(request);
			if (response.isException())
				System.out.println("Exception response: message="
						+ response.getExceptionMessage());
			else
				System.out.println("Success");
		} catch (ModbusTransportException e) {
			e.printStackTrace();
		}
	}
}
