// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.RID
import godot.core.Signal0
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import godot.core.VariantParser._RID
import kotlin.Boolean
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Resource is the base class for all Godot-specific resource types, serving primarily as data
 * containers. Since they inherit from [RefCounted], resources are reference-counted and freed when no
 * longer in use. They can also be nested within other resources, and saved on disk. [PackedScene], one
 * of the most common [Object]s in a Godot project, is also a resource, uniquely capable of storing and
 * instantiating the [Node]s it contains as many times as desired.
 *
 * In GDScript, resources can loaded from disk by their [resourcePath] using [@GDScript.load] or
 * [@GDScript.preload].
 *
 * The engine keeps a global cache of all loaded resources, referenced by paths (see
 * [ResourceLoader.hasCached]). A resource will be cached when loaded for the first time and removed
 * from cache once all references are released. When a resource is cached, subsequent loads using its
 * path will return the cached reference.
 *
 * **Note:** In C#, resources will not be freed instantly after they are no longer in use. Instead,
 * garbage collection will run periodically and will free resources that are no longer in use. This
 * means that unused resources will remain in memory for a while before being removed.
 */
@GodotBaseType
public open class Resource : RefCounted() {
  /**
   * Emitted when the resource changes, usually when one of its properties is modified. See also
   * [emitChanged].
   *
   * **Note:** This signal is not emitted automatically for properties of custom resources. If
   * necessary, a setter needs to be created to emit the signal.
   */
  public val changed: Signal0 by Signal0

  /**
   * Emitted by a newly duplicated resource with [resourceLocalToScene] set to `true`.
   */
  public val setupLocalToSceneRequested: Signal0 by Signal0

  /**
   * If `true`, the resource is duplicated for each instance of all scenes using it. At run-time,
   * the resource can be modified in one scene without affecting other instances (see
   * [PackedScene.instantiate]).
   *
   * **Note:** Changing this property at run-time has no effect on already created duplicate
   * resources.
   */
  public final inline var resourceLocalToScene: Boolean
    @JvmName("resourceLocalToSceneProperty")
    get() = isLocalToScene()
    @JvmName("resourceLocalToSceneProperty")
    set(`value`) {
      setLocalToScene(value)
    }

  /**
   * The unique path to this resource. If it has been saved to disk, the value will be its filepath.
   * If the resource is exclusively contained within a scene, the value will be the [PackedScene]'s
   * filepath, followed by a unique identifier.
   *
   * **Note:** Setting this property manually may fail if a resource with the same path has already
   * been previously loaded. If necessary, use [takeOverPath].
   */
  public final inline var resourcePath: String
    @JvmName("resourcePathProperty")
    get() = getPath()
    @JvmName("resourcePathProperty")
    set(`value`) {
      setPath(value)
    }

  /**
   * An optional name for this resource. When defined, its value is displayed to represent the
   * resource in the Inspector dock. For built-in scripts, the name is displayed as part of the tab
   * name in the script editor.
   *
   * **Note:** Some resource formats do not support resource names. You can still set the name in
   * the editor or via code, but it will be lost when the resource is reloaded. For example, only
   * built-in scripts can have a resource name, while scripts stored in separate files cannot.
   */
  public final inline var resourceName: String
    @JvmName("resourceNameProperty")
    get() = getName()
    @JvmName("resourceNameProperty")
    set(`value`) {
      setName(value)
    }

  /**
   * An unique identifier relative to the this resource's scene. If left empty, the ID is
   * automatically generated when this resource is saved inside a [PackedScene]. If the resource is not
   * inside a scene, this property is empty by default.
   *
   * **Note:** When the [PackedScene] is saved, if multiple resources in the same scene use the same
   * ID, only the earliest resource in the scene hierarchy keeps the original ID. The other resources
   * are assigned new IDs from [generateSceneUniqueId].
   *
   * **Note:** Setting this property does not emit the [signal changed] signal.
   *
   * **Warning:** When setting, the ID must only consist of letters, numbers, and underscores.
   * Otherwise, it will fail and default to a randomly generated ID.
   */
  public final inline var resourceSceneUniqueId: String
    @JvmName("resourceSceneUniqueIdProperty")
    get() = getSceneUniqueId()
    @JvmName("resourceSceneUniqueIdProperty")
    set(`value`) {
      setSceneUniqueId(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(552, scriptIndex)
  }

  /**
   * Override this method to customize the newly duplicated resource created from
   * [PackedScene.instantiate], if the original's [resourceLocalToScene] is set to `true`.
   *
   * **Example:** Set a random `damage` value to every local resource from an instantiated scene:
   *
   * ```
   * extends Resource
   *
   * var damage = 0
   *
   * func _setup_local_to_scene():
   *     damage = randi_range(10, 40)
   * ```
   */
  public open fun _setupLocalToScene(): Unit {
    throw NotImplementedError("_setupLocalToScene is not implemented for Resource")
  }

  /**
   * Override this method to return a custom [RID] when [getRid] is called.
   */
  public open fun _getRid(): RID {
    throw NotImplementedError("_getRid is not implemented for Resource")
  }

  /**
   * For resources that use a variable number of properties, either via [Object.ValidateProperty] or
   * [Object.GetPropertyList], this method should be implemented to correctly clear the resource's
   * state.
   */
  public open fun _resetState(): Unit {
    throw NotImplementedError("_resetState is not implemented for Resource")
  }

  /**
   * Sets the resource's path to [path] without involving the resource cache.
   */
  public open fun _setPathCache(path: String): Unit {
    throw NotImplementedError("_setPathCache is not implemented for Resource")
  }

  public final fun setPath(path: String): Unit {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(ptr, MethodBindings.setPathPtr, NIL)
  }

  /**
   * Sets the [resourcePath] to [path], potentially overriding an existing cache entry for this
   * path. Further attempts to load an overridden resource by path will instead return this resource.
   */
  public final fun takeOverPath(path: String): Unit {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(ptr, MethodBindings.takeOverPathPtr, NIL)
  }

  public final fun getPath(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPathPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Sets the resource's path to [path] without involving the resource cache.
   */
  public final fun setPathCache(path: String): Unit {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(ptr, MethodBindings.setPathCachePtr, NIL)
  }

  public final fun setName(name: String): Unit {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(ptr, MethodBindings.setNamePtr, NIL)
  }

  public final fun getName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the [RID] of this resource (or an empty RID). Many resources (such as [Texture2D],
   * [Mesh], and so on) are high-level abstractions of resources stored in a specialized server
   * ([DisplayServer], [RenderingServer], etc.), so this function will return the original [RID].
   */
  public final fun getRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  public final fun setLocalToScene(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setLocalToScenePtr, NIL)
  }

  public final fun isLocalToScene(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isLocalToScenePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * If [resourceLocalToScene] is set to `true` and the resource has been loaded from a
   * [PackedScene] instantiation, returns the root [Node] of the scene where this resource is used.
   * Otherwise, returns `null`.
   */
  public final fun getLocalScene(): Node? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLocalScenePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Node?)
  }

  /**
   * Calls [_setupLocalToScene]. If [resourceLocalToScene] is set to `true`, this method is
   * automatically called from [PackedScene.instantiate] by the newly duplicated resource within the
   * scene instance.
   */
  public final fun setupLocalToScene(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.setupLocalToScenePtr, NIL)
  }

  /**
   * For resources that use a variable number of properties, either via [Object.ValidateProperty] or
   * [Object.GetPropertyList], override [_resetState] to correctly clear the resource's state.
   */
  public final fun resetState(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.resetStatePtr, NIL)
  }

  /**
   * Sets the unique identifier to [id] for the resource with the given [path] in the resource
   * cache. If the unique identifier is empty, the cache entry using [path] is removed if it exists.
   *
   * **Note:** This method is only implemented when running in an editor context.
   */
  public final fun setIdForPath(path: String, id: String): Unit {
    TransferContext.writeArguments(STRING to path, STRING to id)
    TransferContext.callMethod(ptr, MethodBindings.setIdForPathPtr, NIL)
  }

  /**
   * Returns the unique identifier for the resource with the given [path] from the resource cache.
   * If the resource is not loaded and cached, an empty string is returned.
   *
   * **Note:** This method is only implemented when running in an editor context. At runtime, it
   * returns an empty string.
   */
  public final fun getIdForPath(path: String): String {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(ptr, MethodBindings.getIdForPathPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns `true` if the resource is built-in (from the engine) or `false` if it is user-defined.
   */
  public final fun isBuiltIn(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isBuiltInPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setSceneUniqueId(id: String): Unit {
    TransferContext.writeArguments(STRING to id)
    TransferContext.callMethod(ptr, MethodBindings.setSceneUniqueIdPtr, NIL)
  }

  public final fun getSceneUniqueId(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSceneUniqueIdPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Emits the [signal changed] signal. This method is called automatically for some built-in
   * resources.
   *
   * **Note:** For custom resources, it's recommended to call this method whenever a meaningful
   * change occurs, such as a modified property. This ensures that custom [Object]s depending on the
   * resource are properly updated.
   *
   * ```
   * var damage:
   *     set(new_value):
   *         if damage != new_value:
   *             damage = new_value
   *             emit_changed()
   * ```
   */
  public final fun emitChanged(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.emitChangedPtr, NIL)
  }

  /**
   * Duplicates this resource, returning a new resource with its `export`ed or
   * [PROPERTY_USAGE_STORAGE] properties copied from the original.
   *
   * If [subresources] is `false`, a shallow copy is returned; nested resources within subresources
   * are not duplicated and are shared with the original resource (with one exception; see below). If
   * [subresources] is `true`, a deep copy is returned; nested subresources will be duplicated and are
   * not shared (with two exceptions; see below).
   *
   * [subresources] is usually respected, with the following exceptions:
   *
   * - Subresource properties with the [PROPERTY_USAGE_ALWAYS_DUPLICATE] flag are always duplicated.
   *
   * - Subresource properties with the [PROPERTY_USAGE_NEVER_DUPLICATE] flag are never duplicated.
   *
   * - Subresources inside [Array] and [Dictionary] properties are never duplicated.
   *
   * **Note:** For custom resources, this method will fail if [Object.Init] has been defined with
   * required parameters.
   */
  @JvmOverloads
  public final fun duplicate(subresources: Boolean = false): Resource? {
    TransferContext.writeArguments(BOOL to subresources)
    TransferContext.callMethod(ptr, MethodBindings.duplicatePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Resource?)
  }

  public companion object {
    /**
     * Generates a unique identifier for a resource to be contained inside a [PackedScene], based on
     * the current date, time, and a random value. The returned string is only composed of letters (`a`
     * to `y`) and numbers (`0` to `8`). See also [resourceSceneUniqueId].
     */
    @JvmStatic
    public final fun generateSceneUniqueId(): String {
      TransferContext.writeArguments()
      TransferContext.callMethod(0, MethodBindings.generateSceneUniqueIdPtr, STRING)
      return (TransferContext.readReturnValue(STRING) as String)
    }
  }

  public object MethodBindings {
    internal val setPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Resource", "set_path", 83702148)

    internal val takeOverPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Resource", "take_over_path", 83702148)

    internal val getPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Resource", "get_path", 201670096)

    internal val setPathCachePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Resource", "set_path_cache", 83702148)

    internal val setNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Resource", "set_name", 83702148)

    internal val getNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Resource", "get_name", 201670096)

    internal val getRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Resource", "get_rid", 2944877500)

    internal val setLocalToScenePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Resource", "set_local_to_scene", 2586408642)

    internal val isLocalToScenePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Resource", "is_local_to_scene", 36873697)

    internal val getLocalScenePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Resource", "get_local_scene", 3160264692)

    internal val setupLocalToScenePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Resource", "setup_local_to_scene", 3218959716)

    internal val resetStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Resource", "reset_state", 3218959716)

    internal val setIdForPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Resource", "set_id_for_path", 3186203200)

    internal val getIdForPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Resource", "get_id_for_path", 3135753539)

    internal val isBuiltInPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Resource", "is_built_in", 36873697)

    internal val generateSceneUniqueIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Resource", "generate_scene_unique_id", 2841200299)

    internal val setSceneUniqueIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Resource", "set_scene_unique_id", 83702148)

    internal val getSceneUniqueIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Resource", "get_scene_unique_id", 201670096)

    internal val emitChangedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Resource", "emit_changed", 3218959716)

    internal val duplicatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Resource", "duplicate", 482882304)
  }
}
