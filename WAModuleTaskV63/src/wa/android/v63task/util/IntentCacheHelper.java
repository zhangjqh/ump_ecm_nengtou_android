package wa.android.v63task.util;
/**
 * 处理intent传输数据大小有限问题
 * @author lixkb
 *
 * @param <T>
 */
public class IntentCacheHelper<T> {

	private static IntentCacheHelper<?> instance;
	private T t;

	public static <T> IntentCacheHelper<T> getInstance(Class<T> cls)
	{
		if(instance == null)
		{
			instance = new IntentCacheHelper<T>();
		}
		return (IntentCacheHelper<T>) instance;
	}

	public void setObject(T t)
	{
		this.t = t;
	}

	public T getObject()
	{
		return this.t;
	}

	public void recycle()
	{
		t = null;
	}

}
