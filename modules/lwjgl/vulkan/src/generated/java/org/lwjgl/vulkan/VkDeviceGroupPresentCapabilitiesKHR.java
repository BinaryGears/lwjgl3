/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.vulkan.VK11.*;

/**
 * <pre>{@code
 * struct VkDeviceGroupPresentCapabilitiesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t presentMask[VK_MAX_DEVICE_GROUP_SIZE];
 *     VkDeviceGroupPresentModeFlagsKHR modes;
 * }}</pre>
 */
public class VkDeviceGroupPresentCapabilitiesKHR extends Struct<VkDeviceGroupPresentCapabilitiesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PRESENTMASK,
        MODES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __array(4, VK_MAX_DEVICE_GROUP_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PRESENTMASK = layout.offsetof(2);
        MODES = layout.offsetof(3);
    }

    protected VkDeviceGroupPresentCapabilitiesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDeviceGroupPresentCapabilitiesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkDeviceGroupPresentCapabilitiesKHR(address, container);
    }

    /**
     * Creates a {@code VkDeviceGroupPresentCapabilitiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceGroupPresentCapabilitiesKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return a {@link IntBuffer} view of the {@code presentMask} field. */
    @NativeType("uint32_t[VK_MAX_DEVICE_GROUP_SIZE]")
    public IntBuffer presentMask() { return npresentMask(address()); }
    /** @return the value at the specified index of the {@code presentMask} field. */
    @NativeType("uint32_t")
    public int presentMask(int index) { return npresentMask(address(), index); }
    /** @return the value of the {@code modes} field. */
    @NativeType("VkDeviceGroupPresentModeFlagsKHR")
    public int modes() { return nmodes(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDeviceGroupPresentCapabilitiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRSwapchain#VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_CAPABILITIES_KHR STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_CAPABILITIES_KHR} value to the {@code sType} field. */
    public VkDeviceGroupPresentCapabilitiesKHR sType$Default() { return sType(KHRSwapchain.VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_CAPABILITIES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDeviceGroupPresentCapabilitiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDeviceGroupPresentCapabilitiesKHR set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDeviceGroupPresentCapabilitiesKHR set(VkDeviceGroupPresentCapabilitiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceGroupPresentCapabilitiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceGroupPresentCapabilitiesKHR malloc() {
        return new VkDeviceGroupPresentCapabilitiesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceGroupPresentCapabilitiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceGroupPresentCapabilitiesKHR calloc() {
        return new VkDeviceGroupPresentCapabilitiesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceGroupPresentCapabilitiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkDeviceGroupPresentCapabilitiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceGroupPresentCapabilitiesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceGroupPresentCapabilitiesKHR} instance for the specified memory address. */
    public static VkDeviceGroupPresentCapabilitiesKHR create(long address) {
        return new VkDeviceGroupPresentCapabilitiesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDeviceGroupPresentCapabilitiesKHR createSafe(long address) {
        return address == NULL ? null : new VkDeviceGroupPresentCapabilitiesKHR(address, null);
    }

    /**
     * Returns a new {@link VkDeviceGroupPresentCapabilitiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupPresentCapabilitiesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupPresentCapabilitiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupPresentCapabilitiesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupPresentCapabilitiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupPresentCapabilitiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDeviceGroupPresentCapabilitiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupPresentCapabilitiesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDeviceGroupPresentCapabilitiesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupPresentCapabilitiesKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupPresentCapabilitiesKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupPresentCapabilitiesKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupPresentCapabilitiesKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupPresentCapabilitiesKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupPresentCapabilitiesKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupPresentCapabilitiesKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupPresentCapabilitiesKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDeviceGroupPresentCapabilitiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceGroupPresentCapabilitiesKHR malloc(MemoryStack stack) {
        return new VkDeviceGroupPresentCapabilitiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDeviceGroupPresentCapabilitiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceGroupPresentCapabilitiesKHR calloc(MemoryStack stack) {
        return new VkDeviceGroupPresentCapabilitiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDeviceGroupPresentCapabilitiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupPresentCapabilitiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupPresentCapabilitiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupPresentCapabilitiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDeviceGroupPresentCapabilitiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDeviceGroupPresentCapabilitiesKHR.PNEXT); }
    /** Unsafe version of {@link #presentMask}. */
    public static IntBuffer npresentMask(long struct) { return memIntBuffer(struct + VkDeviceGroupPresentCapabilitiesKHR.PRESENTMASK, VK_MAX_DEVICE_GROUP_SIZE); }
    /** Unsafe version of {@link #presentMask(int) presentMask}. */
    public static int npresentMask(long struct, int index) {
        return memGetInt(struct + VkDeviceGroupPresentCapabilitiesKHR.PRESENTMASK + check(index, VK_MAX_DEVICE_GROUP_SIZE) * 4);
    }
    /** Unsafe version of {@link #modes}. */
    public static int nmodes(long struct) { return memGetInt(struct + VkDeviceGroupPresentCapabilitiesKHR.MODES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDeviceGroupPresentCapabilitiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDeviceGroupPresentCapabilitiesKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkDeviceGroupPresentCapabilitiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkDeviceGroupPresentCapabilitiesKHR, Buffer> implements NativeResource {

        private static final VkDeviceGroupPresentCapabilitiesKHR ELEMENT_FACTORY = VkDeviceGroupPresentCapabilitiesKHR.create(-1L);

        /**
         * Creates a new {@code VkDeviceGroupPresentCapabilitiesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceGroupPresentCapabilitiesKHR#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkDeviceGroupPresentCapabilitiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDeviceGroupPresentCapabilitiesKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkDeviceGroupPresentCapabilitiesKHR.npNext(address()); }
        /** @return a {@link IntBuffer} view of the {@code presentMask} field. */
        @NativeType("uint32_t[VK_MAX_DEVICE_GROUP_SIZE]")
        public IntBuffer presentMask() { return VkDeviceGroupPresentCapabilitiesKHR.npresentMask(address()); }
        /** @return the value at the specified index of the {@code presentMask} field. */
        @NativeType("uint32_t")
        public int presentMask(int index) { return VkDeviceGroupPresentCapabilitiesKHR.npresentMask(address(), index); }
        /** @return the value of the {@code modes} field. */
        @NativeType("VkDeviceGroupPresentModeFlagsKHR")
        public int modes() { return VkDeviceGroupPresentCapabilitiesKHR.nmodes(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDeviceGroupPresentCapabilitiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkDeviceGroupPresentCapabilitiesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRSwapchain#VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_CAPABILITIES_KHR STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_CAPABILITIES_KHR} value to the {@code sType} field. */
        public VkDeviceGroupPresentCapabilitiesKHR.Buffer sType$Default() { return sType(KHRSwapchain.VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_CAPABILITIES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDeviceGroupPresentCapabilitiesKHR.Buffer pNext(@NativeType("void *") long value) { VkDeviceGroupPresentCapabilitiesKHR.npNext(address(), value); return this; }

    }

}