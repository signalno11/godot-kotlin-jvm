def can_build(env, platform):
    return True

def configure(env):
    env.add_module_version_string("jvm.0.13.1")