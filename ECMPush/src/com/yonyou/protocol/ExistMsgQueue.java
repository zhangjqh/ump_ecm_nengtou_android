
/**   
 * @Title: ExistMsgQueue.java 
 * @Package: com.yonyou.protocol 
 * @Description: TODO
 * @author Administrator  
 * @date 2015-7-2 上午9:37:04 
 * @version 1.3.1 
 */


package com.yonyou.protocol;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/** 
 *
 * @package com.yonyou.protocol
 * @author huangbq
 * @date 2015-7-2 上午9:37:04 
 */

@SuppressWarnings("hiding")
public class ExistMsgQueue<String> {
	
	/** 固定容量 —— 10 */
	private int size = 50;
	
	private BlockingQueue<String> existMsg = null;
	
	public ExistMsgQueue() {
		existMsg = new LinkedBlockingQueue<String>(size);
	}
	
	public ExistMsgQueue(int size) {
		this.size = size;
		existMsg = new LinkedBlockingQueue<String>(size);
	}
	
	 
	/** 
	 * 队列是否已满
	 * @return
	 * @author huangbq
	 * @data 2015-7-2 上午10:04:14 
	 */
	  	
	public boolean isFull() {
		if (this.size() == size) {
			return true;
		}
		return false;
	}
	
	
	 
	/** 
	 * 队列是否为空
	 * @return
	 * @author huangbq
	 * @data 2015-7-2 上午10:06:12 
	 */
	  	
	public boolean isEmpty() {
		return existMsg.isEmpty();
	}

	 
	/** 
	 * 添加元素， （如果队列已满则移除对头元素）
	 * @param id
	 * @return
	 * @author huangbq
	 * @data 2015-7-2 上午10:07:14 
	 */
	  	
	public void put(String id) {
		synchronized (existMsg) {
			if(isFull()) {
				existMsg.poll();
				existMsg.add(id);
			} else {
				existMsg.add(id);
			}
				
		}
	}
	
	 
	/** 
	 * 
	 * @param ids
	 * @author huangbq
	 * @data 2015-7-2 上午10:40:18 
	 */
	  	
	public void putAll (Set<String> ids) {
		Iterator<String> iterator = ids.iterator();
		synchronized (existMsg) {
			while (iterator.hasNext()) {
				String id = iterator.next();
				this.put(id);
			}
		}
	}

	/** 
	 * 
	 * @author huangbq
	 * @data 2015-7-2 上午10:16:27 
	 */
	  	
	public void clear() {
		this.existMsg.clear();
	}

	 
	/** 
	 * 
	 * @param id
	 * @return
	 * @author huangbq
	 * @data 2015-7-2 上午10:16:23 
	 */
	  	
	public boolean contains(String id) {
		return this.existMsg.contains(id);
	}
	
	 
	/** 
	 * 
	 * @return
	 * @author huangbq
	 * @data 2015-7-2 上午10:17:05 
	 */
	  	
	public Iterator<String> iterator() {
		return this.existMsg.iterator();
	}

	 
	/** 
	 * 
	 * @return
	 * @author huangbq
	 * @data 2015-7-2 上午10:23:13 
	 */
	  	
	public String poll() {
		return this.existMsg.poll();
	}

	 
	/** 
	 * 
	 * @return
	 * @author huangbq
	 * @data 2015-7-2 上午10:24:14 
	 */
	  	
	public int size() {
		return this.existMsg.size();
	}

	public Set<String> elementSet() {
		Set<String> elementSet = new HashSet<String>();
		Iterator<String> iterator = this.existMsg.iterator();
		synchronized (existMsg) {
			while(iterator.hasNext()) {
				elementSet.add(iterator.next());
			}
		}
		return elementSet;
	}
	
	public boolean remove(String id) {
		return this.existMsg.remove(id);
	}
}
