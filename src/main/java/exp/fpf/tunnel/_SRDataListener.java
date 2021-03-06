package exp.fpf.tunnel;

import exp.fpf.cache.SRMgr;
import exp.libs.warp.net.sock.io.common.IHandler;
import exp.libs.warp.net.sock.io.common.ISession;

/**
 * <pre>
 * 收发数据监听器-socket监听模式
 * </pre>	
 * <br/><B>PROJECT : </B> file-port-forwarding
 * <br/><B>SUPPORT : </B> <a href="http://www.exp-blog.com" target="_blank">www.exp-blog.com</a> 
 * @version   2017-07-31
 * @author    EXP: 272629724@qq.com
 * @since     jdk版本：jdk1.6
 */
class _SRDataListener implements IHandler {

	private SRMgr srMgr;
	
	protected _SRDataListener(SRMgr srMgr) {
		this.srMgr = srMgr;
	}
	
	@Override
	public void _handle(ISession session) {
		while(!session.isClosed()) {
			String json = session.read();
			srMgr.addRecvData(json);	// 转存接收到的数据
		}
		session.close();
	}

	@Override
	public IHandler _clone() {
		// Undo
		return null;
	}

	@Deprecated
	@Override
	public boolean _login(ISession arg0) {
		return true;
	}

}