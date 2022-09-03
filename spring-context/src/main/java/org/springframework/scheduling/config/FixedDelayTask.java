/*
 * Copyright 2002-2022 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.scheduling.config;

import java.time.Duration;

/**
 * Specialization of {@link IntervalTask} for fixed-delay semantics.
 *
 * @author Juergen Hoeller
 * @author Arjen Poutsma
 * @since 5.0.2
 * @see org.springframework.scheduling.annotation.Scheduled#fixedDelay()
 * @see ScheduledTaskRegistrar#addFixedDelayTask(IntervalTask)
 */
public class FixedDelayTask extends IntervalTask {

	/**
	 * Create a new {@code FixedDelayTask}.
	 * @param runnable the underlying task to execute
	 * @param interval how often in milliseconds the task should be executed
	 * @param initialDelay the initial delay before first execution of the task
	 * @deprecated as of 6.0, in favor on {@link #FixedDelayTask(Runnable, Duration, Duration)}
	 */
	@Deprecated
	public FixedDelayTask(Runnable runnable, long interval, long initialDelay) {
		super(runnable, interval, initialDelay);
	}

	/**
	 * Create a new {@code FixedDelayTask}.
	 * @param runnable the underlying task to execute
	 * @param interval how often the task should be executed
	 * @param initialDelay the initial delay before first execution of the task
	 * @since 6.0
	 */
	public FixedDelayTask(Runnable runnable, Duration interval, Duration initialDelay) {
		super(runnable, interval, initialDelay);
	}

	FixedDelayTask(IntervalTask task) {
		super(task);
	}

}
