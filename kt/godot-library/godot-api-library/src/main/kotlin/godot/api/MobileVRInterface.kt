// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Rect2
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.core.VariantParser.RECT2
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * This is a generic mobile VR implementation where you need to provide details about the phone and
 * HMD used. It does not rely on any existing framework. This is the most basic interface we have. For
 * the best effect, you need a mobile phone with a gyroscope and accelerometer.
 *
 * Note that even though there is no positional tracking, the camera will assume the headset is at a
 * height of 1.85 meters. You can change this by setting [eyeHeight].
 *
 * You can initialize this interface as follows:
 *
 * ```
 * var interface = XRServer.find_interface("Native mobile")
 * if interface and interface.initialize():
 *     get_viewport().use_xr = true
 * ```
 *
 * **Note:** For Android, [ProjectSettings.inputDevices/sensors/enableAccelerometer],
 * [ProjectSettings.inputDevices/sensors/enableGravity],
 * [ProjectSettings.inputDevices/sensors/enableGyroscope] and
 * [ProjectSettings.inputDevices/sensors/enableMagnetometer] must be enabled.
 */
@GodotBaseType
public open class MobileVRInterface : XRInterface() {
  /**
   * The height at which the camera is placed in relation to the ground (i.e. [XROrigin3D] node).
   */
  public final inline var eyeHeight: Double
    @JvmName("eyeHeightProperty")
    get() = getEyeHeight()
    @JvmName("eyeHeightProperty")
    set(`value`) {
      setEyeHeight(value)
    }

  /**
   * The interocular distance, also known as the interpupillary distance. The distance between the
   * pupils of the left and right eye.
   */
  public final inline var iod: Double
    @JvmName("iodProperty")
    get() = getIod()
    @JvmName("iodProperty")
    set(`value`) {
      setIod(value)
    }

  /**
   * The width of the display in centimeters.
   */
  public final inline var displayWidth: Double
    @JvmName("displayWidthProperty")
    get() = getDisplayWidth()
    @JvmName("displayWidthProperty")
    set(`value`) {
      setDisplayWidth(value)
    }

  /**
   * The distance between the display and the lenses inside of the device in centimeters.
   */
  public final inline var displayToLens: Double
    @JvmName("displayToLensProperty")
    get() = getDisplayToLens()
    @JvmName("displayToLensProperty")
    set(`value`) {
      setDisplayToLens(value)
    }

  /**
   * Set the offset rect relative to the area being rendered. A length of 1 represents the whole
   * rendering area on that axis.
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
   */
  @CoreTypeLocalCopy
  public final inline var offsetRect: Rect2
    @JvmName("offsetRectProperty")
    get() = getOffsetRect()
    @JvmName("offsetRectProperty")
    set(`value`) {
      setOffsetRect(value)
    }

  /**
   * The oversample setting. Because of the lens distortion we have to render our buffers at a
   * higher resolution then the screen can natively handle. A value between 1.5 and 2.0 often provides
   * good results but at the cost of performance.
   */
  public final inline var oversample: Double
    @JvmName("oversampleProperty")
    get() = getOversample()
    @JvmName("oversampleProperty")
    set(`value`) {
      setOversample(value)
    }

  /**
   * The k1 lens factor is one of the two constants that define the strength of the lens used and
   * directly influences the lens distortion effect.
   */
  public final inline var k1: Double
    @JvmName("k1Property")
    get() = getK1()
    @JvmName("k1Property")
    set(`value`) {
      setK1(value)
    }

  /**
   * The k2 lens factor, see k1.
   */
  public final inline var k2: Double
    @JvmName("k2Property")
    get() = getK2()
    @JvmName("k2Property")
    set(`value`) {
      setK2(value)
    }

  /**
   * The minimum radius around the focal point where full quality is guaranteed if VRS is used as a
   * percentage of screen size.
   *
   * **Note:** Mobile and Forward+ renderers only. Requires [Viewport.vrsMode] to be set to
   * [Viewport.VRS_XR].
   */
  public final inline var vrsMinRadius: Float
    @JvmName("vrsMinRadiusProperty")
    get() = getVrsMinRadius()
    @JvmName("vrsMinRadiusProperty")
    set(`value`) {
      setVrsMinRadius(value)
    }

  /**
   * The strength used to calculate the VRS density map. The greater this value, the more noticeable
   * VRS is. This improves performance at the cost of quality.
   *
   * **Note:** Mobile and Forward+ renderers only. Requires [Viewport.vrsMode] to be set to
   * [Viewport.VRS_XR].
   */
  public final inline var vrsStrength: Float
    @JvmName("vrsStrengthProperty")
    get() = getVrsStrength()
    @JvmName("vrsStrengthProperty")
    set(`value`) {
      setVrsStrength(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(361, scriptIndex)
  }

  /**
   * This is a helper function for [offsetRect] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = mobilevrinterface.offsetRect
   * //Your changes
   * mobilevrinterface.offsetRect = myCoreType
   * ``````
   *
   * Set the offset rect relative to the area being rendered. A length of 1 represents the whole
   * rendering area on that axis.
   */
  @CoreTypeHelper
  public final fun offsetRectMutate(block: Rect2.() -> Unit): Rect2 = offsetRect.apply {
     block(this)
     offsetRect = this
  }

  public final fun setEyeHeight(eyeHeight: Double): Unit {
    TransferContext.writeArguments(DOUBLE to eyeHeight)
    TransferContext.callMethod(ptr, MethodBindings.setEyeHeightPtr, NIL)
  }

  public final fun getEyeHeight(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEyeHeightPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun setIod(iod: Double): Unit {
    TransferContext.writeArguments(DOUBLE to iod)
    TransferContext.callMethod(ptr, MethodBindings.setIodPtr, NIL)
  }

  public final fun getIod(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getIodPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun setDisplayWidth(displayWidth: Double): Unit {
    TransferContext.writeArguments(DOUBLE to displayWidth)
    TransferContext.callMethod(ptr, MethodBindings.setDisplayWidthPtr, NIL)
  }

  public final fun getDisplayWidth(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDisplayWidthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun setDisplayToLens(displayToLens: Double): Unit {
    TransferContext.writeArguments(DOUBLE to displayToLens)
    TransferContext.callMethod(ptr, MethodBindings.setDisplayToLensPtr, NIL)
  }

  public final fun getDisplayToLens(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDisplayToLensPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun setOffsetRect(offsetRect: Rect2): Unit {
    TransferContext.writeArguments(RECT2 to offsetRect)
    TransferContext.callMethod(ptr, MethodBindings.setOffsetRectPtr, NIL)
  }

  public final fun getOffsetRect(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOffsetRectPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2) as Rect2)
  }

  public final fun setOversample(oversample: Double): Unit {
    TransferContext.writeArguments(DOUBLE to oversample)
    TransferContext.callMethod(ptr, MethodBindings.setOversamplePtr, NIL)
  }

  public final fun getOversample(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOversamplePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun setK1(k: Double): Unit {
    TransferContext.writeArguments(DOUBLE to k)
    TransferContext.callMethod(ptr, MethodBindings.setK1Ptr, NIL)
  }

  public final fun getK1(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getK1Ptr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun setK2(k: Double): Unit {
    TransferContext.writeArguments(DOUBLE to k)
    TransferContext.callMethod(ptr, MethodBindings.setK2Ptr, NIL)
  }

  public final fun getK2(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getK2Ptr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun getVrsMinRadius(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVrsMinRadiusPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setVrsMinRadius(radius: Float): Unit {
    TransferContext.writeArguments(DOUBLE to radius.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setVrsMinRadiusPtr, NIL)
  }

  public final fun getVrsStrength(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVrsStrengthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setVrsStrength(strength: Float): Unit {
    TransferContext.writeArguments(DOUBLE to strength.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setVrsStrengthPtr, NIL)
  }

  public companion object

  public object MethodBindings {
    internal val setEyeHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MobileVRInterface", "set_eye_height", 373806689)

    internal val getEyeHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MobileVRInterface", "get_eye_height", 1740695150)

    internal val setIodPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MobileVRInterface", "set_iod", 373806689)

    internal val getIodPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MobileVRInterface", "get_iod", 1740695150)

    internal val setDisplayWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MobileVRInterface", "set_display_width", 373806689)

    internal val getDisplayWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MobileVRInterface", "get_display_width", 1740695150)

    internal val setDisplayToLensPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MobileVRInterface", "set_display_to_lens", 373806689)

    internal val getDisplayToLensPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MobileVRInterface", "get_display_to_lens", 1740695150)

    internal val setOffsetRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MobileVRInterface", "set_offset_rect", 2046264180)

    internal val getOffsetRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MobileVRInterface", "get_offset_rect", 1639390495)

    internal val setOversamplePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MobileVRInterface", "set_oversample", 373806689)

    internal val getOversamplePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MobileVRInterface", "get_oversample", 1740695150)

    internal val setK1Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("MobileVRInterface", "set_k1", 373806689)

    internal val getK1Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("MobileVRInterface", "get_k1", 1740695150)

    internal val setK2Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("MobileVRInterface", "set_k2", 373806689)

    internal val getK2Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("MobileVRInterface", "get_k2", 1740695150)

    internal val getVrsMinRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MobileVRInterface", "get_vrs_min_radius", 1740695150)

    internal val setVrsMinRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MobileVRInterface", "set_vrs_min_radius", 373806689)

    internal val getVrsStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MobileVRInterface", "get_vrs_strength", 1740695150)

    internal val setVrsStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MobileVRInterface", "set_vrs_strength", 373806689)
  }
}
