package core.java;

import java.util.Date;

/**
 * Immutable classes are those class,
 * whose object can not be modified once
 * created, it means any modification on
 * immutable object will result in
 * another immutable object.
 * 
 * Example ::
 * 
 * String and StringBuffer.
 * 
 * 
 *
 */
public final class ImmutableClass {

	private final Date remindingDate;

	public ImmutableClass(Date remindingDate) {
		if (remindingDate.getTime() < System.currentTimeMillis()) {
			throw new IllegalArgumentException("Can not set reminder for past time:" + remindingDate);
		}
		this.remindingDate = new Date(remindingDate.getTime());
	}

	public Date getRemindingDate() {
		return (Date) remindingDate.clone();
	}

}
