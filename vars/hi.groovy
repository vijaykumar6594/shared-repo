def call (Map config = [:]){
sh 'echo hello $"{config.name}".${config.day}'
}
