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
import godot.core.NodePath
import godot.core.Signal0
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.NODE_PATH
import godot.core.VariantParser.OBJECT
import godot.core.asCachedNodePath
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A node used for advanced animation transitions in an [AnimationPlayer].
 *
 * **Note:** When linked with an [AnimationPlayer], several properties and methods of the
 * corresponding [AnimationPlayer] will not function as expected. Playback and transitions should be
 * handled using only the [AnimationTree] and its constituent [AnimationNode](s). The [AnimationPlayer]
 * node should be used solely for adding, deleting, and editing animations.
 */
@GodotBaseType
public open class AnimationTree : AnimationMixer() {
  /**
   * Emitted when the [animPlayer] is changed.
   */
  public val animationPlayerChanged: Signal0 by Signal0

  /**
   * The root animation node of this [AnimationTree]. See [AnimationRootNode].
   */
  public final inline var treeRoot: AnimationRootNode?
    @JvmName("treeRootProperty")
    get() = getTreeRoot()
    @JvmName("treeRootProperty")
    set(`value`) {
      setTreeRoot(value)
    }

  /**
   * The path to the [Node] used to evaluate the [AnimationNode] [Expression] if one is not
   * explicitly specified internally.
   */
  public final inline var advanceExpressionBaseNode: NodePath
    @JvmName("advanceExpressionBaseNodeProperty")
    get() = getAdvanceExpressionBaseNode()
    @JvmName("advanceExpressionBaseNodeProperty")
    set(`value`) {
      setAdvanceExpressionBaseNode(value)
    }

  /**
   * The path to the [AnimationPlayer] used for animating.
   */
  public final inline var animPlayer: NodePath
    @JvmName("animPlayerProperty")
    get() = getAnimationPlayer()
    @JvmName("animPlayerProperty")
    set(`value`) {
      setAnimationPlayer(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(37, scriptIndex)
  }

  public final fun setTreeRoot(animationNode: AnimationRootNode?): Unit {
    TransferContext.writeArguments(OBJECT to animationNode)
    TransferContext.callMethod(ptr, MethodBindings.setTreeRootPtr, NIL)
  }

  public final fun getTreeRoot(): AnimationRootNode? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTreeRootPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as AnimationRootNode?)
  }

  public final fun setAdvanceExpressionBaseNode(path: NodePath): Unit {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(ptr, MethodBindings.setAdvanceExpressionBaseNodePtr, NIL)
  }

  public final fun getAdvanceExpressionBaseNode(): NodePath {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAdvanceExpressionBaseNodePtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH) as NodePath)
  }

  public final fun setAnimationPlayer(path: NodePath): Unit {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(ptr, MethodBindings.setAnimationPlayerPtr, NIL)
  }

  public final fun getAnimationPlayer(): NodePath {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAnimationPlayerPtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH) as NodePath)
  }

  /**
   * Sets the process notification in which to update animations.
   */
  public final fun setProcessCallback(mode: AnimationProcessCallback): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.setProcessCallbackPtr, NIL)
  }

  /**
   * Returns the process notification in which to update animations.
   */
  public final fun getProcessCallback(): AnimationProcessCallback {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getProcessCallbackPtr, LONG)
    return AnimationProcessCallback.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setAdvanceExpressionBaseNode(path: String) =
      setAdvanceExpressionBaseNode(path.asCachedNodePath())

  public final fun setAnimationPlayer(path: String) = setAnimationPlayer(path.asCachedNodePath())

  public enum class AnimationProcessCallback(
    id: Long,
  ) {
    PHYSICS(0),
    IDLE(1),
    MANUAL(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): AnimationProcessCallback = entries.single { it.id == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val setTreeRootPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationTree", "set_tree_root", 2581683800)

    internal val getTreeRootPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationTree", "get_tree_root", 4110384712)

    internal val setAdvanceExpressionBaseNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationTree", "set_advance_expression_base_node", 1348162250)

    internal val getAdvanceExpressionBaseNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationTree", "get_advance_expression_base_node", 4075236667)

    internal val setAnimationPlayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationTree", "set_animation_player", 1348162250)

    internal val getAnimationPlayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationTree", "get_animation_player", 4075236667)

    internal val setProcessCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationTree", "set_process_callback", 1723352826)

    internal val getProcessCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationTree", "get_process_callback", 891317132)
  }
}
