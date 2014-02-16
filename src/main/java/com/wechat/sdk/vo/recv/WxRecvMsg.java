package com.wechat.sdk.vo.recv;

import com.wechat.sdk.vo.WxMsg;

public class WxRecvMsg extends WxMsg {
	private String msgId;
	
	public WxRecvMsg(String toUser,String fromUser,String createDt,String msgType,String msgId) {
		super(toUser, fromUser, createDt, msgType);
		this.msgId= msgId;
	}
	
	public WxRecvMsg(WxRecvMsg msg) {
		this(msg.getToUser(),msg.getFromUser(),msg.getCreateDt(),msg.getMsgType(),msg.getMsgId());
	}
	
	public String getMsgId() {
		return msgId;
	}
	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}
}
