package client;

import java.io.ObjectInputStream;
// ��ǲ��Ʈ���� ���������� �о���δ�.
public class ClientReciever extends Thread {
	private ClientAccept clientAccept;
	private ObjectInputStream clientIS;
	
	public ClientReciever(ClientAccept accept) {
		this.clientAccept = accept;
		this.clientIS = this.clientAccept.getClientIS();
	}
	
	//TODO �����Ͱ� �ѳ���� �� ��.
	@Override
	public void run() {
		while(true) {
			
		}
	}
	
	
}
