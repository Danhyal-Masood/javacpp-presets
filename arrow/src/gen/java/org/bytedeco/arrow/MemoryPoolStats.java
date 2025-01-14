// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.arrow.global.arrow.*;


///////////////////////////////////////////////////////////////////////
// Helper tracking memory statistics

@Namespace("arrow::internal") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class MemoryPoolStats extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MemoryPoolStats(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public MemoryPoolStats(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public MemoryPoolStats position(long position) {
        return (MemoryPoolStats)super.position(position);
    }

  public MemoryPoolStats() { super((Pointer)null); allocate(); }
  private native void allocate();

  public native @Cast("int64_t") long max_memory();

  public native @Cast("int64_t") long bytes_allocated();

  public native void UpdateAllocatedBytes(@Cast("int64_t") long diff);
}
