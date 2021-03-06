package exp.fpf.tunnel;

import java.io.File;

import org.apache.commons.io.monitor.FileAlterationListener;
import org.apache.commons.io.monitor.FileAlterationObserver;

import exp.fpf.cache.SRMgr;
import exp.fpf.envm.Param;

/**
 * <pre>
 * 收发数据监听器-文件扫描模式
 * </pre>	
 * <br/><B>PROJECT : </B> file-port-forwarding
 * <br/><B>SUPPORT : </B> <a href="http://www.exp-blog.com" target="_blank">www.exp-blog.com</a> 
 * @version   2017-07-31
 * @author    EXP: 272629724@qq.com
 * @since     jdk版本：jdk1.6
 */
public class _SRFileListener implements FileAlterationListener {

	private SRMgr srMgr;
	
	private String prefix;
	
	private String suffix;
	
	public _SRFileListener(SRMgr srMgr, 
			String prefix, String suffix) {
		this.srMgr = srMgr;
		this.prefix = prefix;
		this.suffix = suffix;
	}
	
	@Override
	public void onStart(FileAlterationObserver observer) {
		// Undo
	}

	@Override
	public void onDirectoryCreate(File directory) {
		// Undo
	}

	@Override
	public void onDirectoryChange(File directory) {
		// Undo
	}

	@Override
	public void onDirectoryDelete(File directory) {
		// Undo
	}

	@Override
	public void onFileCreate(File file) {
		String name = file.getName();
		if(name.endsWith(suffix) && name.startsWith(prefix)) {
			if(Param.PREFIX_SEND.equals(prefix)) {
				srMgr.addSendFile(name);
				
			} else if(Param.PREFIX_RECV.equals(prefix)) {
				srMgr.addRecvFile(name);
			}
		}
	}

	@Override
	public void onFileChange(File file) {
		// Undo
	}

	@Override
	public void onFileDelete(File file) {
		// Undo
	}

	@Override
	public void onStop(FileAlterationObserver observer) {
		// Undo
	}

}
