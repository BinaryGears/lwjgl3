/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val khr_icd = "KHRICD".nativeClassCL("khr_icd", KHR) {
    IntConstant(
        "PLATFORM_ICD_SUFFIX_KHR"..0x0920
    )

    IntConstant(
        "PLATFORM_NOT_FOUND_KHR".."-1001"
    )

    // clIcdGetPlatformIDsKHR is not exposed through the ICD.

}