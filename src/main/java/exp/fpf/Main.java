package exp.fpf;

import java.util.List;

import exp.fpf.bean.FPFConfig;
import exp.fpf.nat.FPFAgent;
import exp.libs.utils.other.LogUtils;


/**
 * <PRE>
 * 程序入口
 * </PRE>
 * <br/><B>PROJECT : </B> file-port-forwarding
 * <br/><B>SUPPORT : </B> <a href="http://www.exp-blog.com" target="_blank">www.exp-blog.com</a> 
 * @version   2017-07-31
 * @author    EXP: 272629724@qq.com
 * @since     jdk版本：jdk1.6
 */
public class Main {
	
	public static void main(String[] args) {
		LogUtils.loadLogBackConfig();
		
		String sendDir = Config.getInstn().getSendDir();
		String recvDir = Config.getInstn().getRecvDir();
		int overtime = Config.getInstn().getOvertime();
		List<FPFConfig> serverConfigs = Config.getInstn().getFPFConfigs();
		FPFAgent agent = new FPFAgent(sendDir, recvDir, overtime, serverConfigs);
		agent._start();
	}
	
}
