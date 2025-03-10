/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class NVDrawBuffers {

    static { GLES.initialize(); }

    public static final int
        GL_MAX_DRAW_BUFFERS_NV = 0x8824,
        GL_DRAW_BUFFER0_NV     = 0x8825,
        GL_DRAW_BUFFER1_NV     = 0x8826,
        GL_DRAW_BUFFER2_NV     = 0x8827,
        GL_DRAW_BUFFER3_NV     = 0x8828,
        GL_DRAW_BUFFER4_NV     = 0x8829,
        GL_DRAW_BUFFER5_NV     = 0x882A,
        GL_DRAW_BUFFER6_NV     = 0x882B,
        GL_DRAW_BUFFER7_NV     = 0x882C,
        GL_DRAW_BUFFER8_NV     = 0x882D,
        GL_DRAW_BUFFER9_NV     = 0x882E,
        GL_DRAW_BUFFER10_NV    = 0x882F,
        GL_DRAW_BUFFER11_NV    = 0x8830,
        GL_DRAW_BUFFER12_NV    = 0x8831,
        GL_DRAW_BUFFER13_NV    = 0x8832,
        GL_DRAW_BUFFER14_NV    = 0x8833,
        GL_DRAW_BUFFER15_NV    = 0x8834;

    public static final int
        GL_COLOR_ATTACHMENT0_NV  = 0x8CE0,
        GL_COLOR_ATTACHMENT1_NV  = 0x8CE1,
        GL_COLOR_ATTACHMENT2_NV  = 0x8CE2,
        GL_COLOR_ATTACHMENT3_NV  = 0x8CE3,
        GL_COLOR_ATTACHMENT4_NV  = 0x8CE4,
        GL_COLOR_ATTACHMENT5_NV  = 0x8CE5,
        GL_COLOR_ATTACHMENT6_NV  = 0x8CE6,
        GL_COLOR_ATTACHMENT7_NV  = 0x8CE7,
        GL_COLOR_ATTACHMENT8_NV  = 0x8CE8,
        GL_COLOR_ATTACHMENT9_NV  = 0x8CE9,
        GL_COLOR_ATTACHMENT10_NV = 0x8CEA,
        GL_COLOR_ATTACHMENT11_NV = 0x8CEB,
        GL_COLOR_ATTACHMENT12_NV = 0x8CEC,
        GL_COLOR_ATTACHMENT13_NV = 0x8CED,
        GL_COLOR_ATTACHMENT14_NV = 0x8CEE,
        GL_COLOR_ATTACHMENT15_NV = 0x8CEF;

    protected NVDrawBuffers() {
        throw new UnsupportedOperationException();
    }

    // --- [ glDrawBuffersNV ] ---

    /** {@code void glDrawBuffersNV(GLsizei n, GLenum const * bufs)} */
    public static native void nglDrawBuffersNV(int n, long bufs);

    /** {@code void glDrawBuffersNV(GLsizei n, GLenum const * bufs)} */
    public static void glDrawBuffersNV(@NativeType("GLenum const *") IntBuffer bufs) {
        nglDrawBuffersNV(bufs.remaining(), memAddress(bufs));
    }

    /** {@code void glDrawBuffersNV(GLsizei n, GLenum const * bufs)} */
    public static void glDrawBuffersNV(@NativeType("GLenum const *") int buf) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer bufs = stack.ints(buf);
            nglDrawBuffersNV(1, memAddress(bufs));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glDrawBuffersNV(GLsizei n, GLenum const * bufs)} */
    public static void glDrawBuffersNV(@NativeType("GLenum const *") int[] bufs) {
        long __functionAddress = GLES.getICD().glDrawBuffersNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(bufs.length, bufs, __functionAddress);
    }

}