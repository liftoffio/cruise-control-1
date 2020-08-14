/*
 * Copyright 2020 LinkedIn Corp. Licensed under the BSD 2-Clause License (the "License"). See License in the project root for license information.
 */
package com.linkedin.kafka.cruisecontrol.executor;

<<<<<<< HEAD
=======
import java.util.Arrays;
>>>>>>> 7af2c90b (Make min execution progress check interval and slow task alerting backoff configurable (#1313))
import java.util.Collections;
import java.util.List;

public enum ExecutionTaskState {
    PENDING, IN_PROGRESS, ABORTING, ABORTED, DEAD, COMPLETED;

<<<<<<< HEAD
    private static final List<ExecutionTaskState> CACHED_VALUES = List.of(values());
=======
    private static final List<ExecutionTaskState> CACHED_VALUES = Collections.unmodifiableList(Arrays.asList(values()));
>>>>>>> 7af2c90b (Make min execution progress check interval and slow task alerting backoff configurable (#1313))

    /**
     * Use this instead of values() because values() creates a new array each time.
     * @return enumerated values in the same order as values()
     */
    public static List<ExecutionTaskState> cachedValues() {
<<<<<<< HEAD
        return Collections.unmodifiableList(CACHED_VALUES);
=======
        return CACHED_VALUES;
>>>>>>> 7af2c90b (Make min execution progress check interval and slow task alerting backoff configurable (#1313))
    }
}
