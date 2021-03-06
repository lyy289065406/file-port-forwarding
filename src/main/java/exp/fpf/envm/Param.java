package exp.fpf.envm;

import exp.fpf.Config;
import exp.libs.warp.net.sock.bean.SocketBean;

/**
 * <pre>
 * 常量参数表
 * </pre>	
 * <br/><B>PROJECT : </B> file-port-forwarding
 * <br/><B>SUPPORT : </B> <a href="http://www.exp-blog.com" target="_blank">www.exp-blog.com</a> 
 * @version   2017-07-31
 * @author    EXP: 272629724@qq.com
 * @since     jdk版本：jdk1.6
 */
public final class Param {

	/** 建立连接标识 */
	public final static String MARK_CONN = "#conn#";
	
	/** 断开连接标识 */
	public final static String MARK_EXIT = "#exit#";
	
	/** 重置会话标识 */
	public final static String MARK_RESET = "#reset#";
	
	/** 发送文件前缀标识 */
	public final static String PREFIX_SEND = "send";
	
	/** 接收文件前缀标识 */
	public final static String PREFIX_RECV = "recv";
	
	/** 收发文件后缀 */
	public final static String SUFFIX = ".txt";
	
	/** PC队列默认容量 */
	public final static int PC_CAPACITY = 1024;
	
	/** Socket读写缓存：每次最多读写10KB数据 */
	public final static int IO_BUFF = 10 * SocketBean.BUFF_SIZE_UNIT_KB;
	
	/** 管理会话ID */
	public final static String MGR_SESS_ID = "0";
	
	/** 管理会话IP */
	public final static String MGR_SESS_IP = "0.0.0.0";
	
	/** 管理会话端口 */
	public final static int MGR_SESS_PORT = 0;
	
	/** JSON属性：会话ID */
	public final static String SID = "sid";
	
	/** JSON属性：会话数据 */
	public final static String DATA = "data";
	
	/** 扫描文件/监听数据间隔: 单位ms */
	public final static long SCAN_DATA_INTERVAL = Config.getInstn().getScanInterval();
	
	/** 检测文件数据传输完成间隔: 单位ms */
	public final static long WAIT_DATA_INTERVAL = 1;
	
}
