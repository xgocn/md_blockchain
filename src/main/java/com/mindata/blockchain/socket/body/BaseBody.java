package com.mindata.blockchain.socket.body;

/**
 *
 * @author tanyaowu
 * 2017年3月27日 上午12:12:17
 */
public class BaseBody {

	/**
	 * 消息发送时间
	 */
	private Long time = System.currentTimeMillis();

	/**
	 * @return the time
	 */
	public Long getTime() {
		return time;
	}

	/**
	 * @param time the time to set
	 */
	public void setTime(Long time) {
		this.time = time;
	}
}
