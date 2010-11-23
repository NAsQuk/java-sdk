/*
 * @(#)EventListener.java	1.14 10/03/23
 *
 * Копирайт (c) 2006, Oracle и/или его филиалы. Все права защищены.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Использовать в соответствии с лицензией.
 */
 
package sunw.util;

/**
 * ТОЛЬКО ДЛЯ ОБРАТНОЙ СОВМЕСТИМОСТИ - НЕ ИСПОЛЬЗОВАТЬ.
 * <p>
 * Это класс для обратной совместимости, позволяющий компонентам Java Beans,
 * разработанным под JDK 1.0.2, корректно выполняться под JDK 1.1.
 * <p>
 * Чтобы позволить разработку компонентов под JDK 1.0.2, JavaSoft предоставляет 
 * три ничего не делающих интерфейса/класса (sunw.io.Serializable, 
 * sunw.util.EventObject и sunw.util.EventListener), которые могут быть 
 * загружены в JDK 1.0.2 системы, и которые являются переходниками к реальным
 * классам JDK 1.1.
 * <p>
 * Теперь под JDK 1.1 мы предоставляем версии этих классов и интерфейсов,
 * унаследованных от реальных версий в java.util и java.io. Это означает,
 * что компоненты, разработанные под JDK 1.0.2 с использованием классов 
 * sunw.*, будут продолжать работать на JDK 1.1 и будут (косвенно) унаследованы
 * от соответствующих интерфейсов/классов java.* .
 *
 * @deprecated Это тип для совместимости, позволяющий Java Beans, разработанным
 * под JDK 1.0.2, корректно выполняться под JDK 1.1. Соответствующим типом в
 * JDK1.1 является java.util.EventListener.
 *
 * @see java.util.EventListener
 */

public interface EventListener extends java.util.EventListener {
}
