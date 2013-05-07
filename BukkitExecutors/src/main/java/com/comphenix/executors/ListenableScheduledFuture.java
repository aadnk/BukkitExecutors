package com.comphenix.executors;

import java.util.concurrent.RunnableScheduledFuture;

import com.google.common.util.concurrent.ListenableFuture;

public interface ListenableScheduledFuture<V>
	extends RunnableScheduledFuture<V>, ListenableFuture<V> {
}