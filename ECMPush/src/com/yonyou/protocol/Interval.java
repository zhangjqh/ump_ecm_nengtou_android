package com.yonyou.protocol;

/**
 * @see 断线重连间隔策略
 * @file Interval.java
 * @package com.mymina.client
 * @project minaclient
 * @author huangbq
 * @date 2014年9月9日 下午3:32:26
 */
public enum Interval {

	// 初始3分钟15秒重连一次
	FIRET(15000),       
	SECOND(15000),     
	THIRD(15000),      
	FOURTH(15000),     
	FIFTH(15000),      	
	SIXTH(15000),     
	SEVENTH(15000),  
	EIGHTH(15000),  
	NINTH(15000),
	TENTH(15000),
	ELEVENTH(15000),
	TWELFTH(15000),
	// 3~15分钟30秒重连一次
	THIRTEENTH(30000),
	FOURTEENTH(30000),
	FIFTEENTH(30000),
	SIXTEENTH(30000),
	SEVENTEENTH(30000),
	EIGHTEENTH(30000),
	NINTEENTH(30000),
	TWENTIETH(30000),
	TWENTY_FIRST(30000),
	TWENTY_SECOND(30000),
	TWENTY_THIRD(30000),
	TWENTY_FOURTH(30000),
	TWENTY_FIFTH(30000),
	TWENTY_SIXTH(30000),
	TWENTY_SEVENTH(30000),
	TWENTY_EIGHTH(30000),
	TWENTY_NINTH(30000),
	THIRTIETH(30000),
	THIRTY_FIRST(30000),
	THIRTY_SECOND(30000),
	THIRTY_THIRD(30000),
	THIRTY_FOURTH(30000),
	THIRTY_FIFTH(30000),
	THIRTY_SIXTH(30000),
	// 15~60分钟5分钟重连一次
	THIRTY_SEVENTH(300000),
	THIRTY_EIGHTH(300000),
	THIRTY_NINTH(300000),
	FORTIETH(300000),
	FORTY_FIRST(300000),
	FORTY_SECOND(300000),
	FORTY_THIRD(300000),
	FORTY_FOURTH(300000),
	FORTY_FIFTH(300000),
	// 1~2小时15分钟重连一次
	FORTY_SIXTH(900000),
	FORTY_SEVENTH(900000),
	FORTY_EIGHTH(900000),
	FORTY_NINTH(900000),
	// 2~5小时30分钟重连一次
	FIFTIETH(1800000),
	FIFTY_FIRST(1800000),
	FIFTY_SECOND(1800000),
	FIFTY_THIRD(1800000),
	FIFTY_FOURTH(1800000),
	FIFTY_FIFTH(1800000),
	// 5~12小时1小时重连一次
	FIFTY_SIXTH(3600000),
	FIFTY_SEVENTH(3600000),
	FIFTY_EIGHTH(3600000),
	SIXTIETH(3600000),
	SIXTY_FIRST(3600000),
	SIXTY_SECOND(3600000),
	SIXTY_THIRD(3600000),
	// 12~24小时3小时重连一次
	SIXTY_FOURTH(10800000),
	SIXTY_FIFTY(10800000),
	SIXTY_SIXTH(10800000),
	SIXTY_SEVENTH(10800000),
	// 2~5天12小时重连一次
	SIXTY_EIGHTH(43200000),
	SIXTY_NINTH(43200000),
	SEVENTIETH(43200000),
	SEVENTY_FIRST(43200000),
	SEVENTY_SECOND(43200000),
	SEVENTY_THIRD(43200000),
	SEVENTY_FOURTH(43200000),
	SEVENTY_FIFTH(43200000);
	// 超过5天不在重连
	
	/** 断线重连时间间隔*/
	private long time;
	
	private Interval(long time) {
		this.time = time;
	}

	/**
	 * @see 获取时间间隔
	 * @method getTime
	 * @return time
	 * @date 2014年9月9日 下午3:30:23
	 */
	public long getTime() {
		return time;
	}

	/**
	 * @see 设置时间间隔
	 * @method setTime
	 * @param time
	 * @date 2014年9月9日 下午3:30:58
	 */
	public void setTime(long time) {
		this.time = time;
	}
	
}
