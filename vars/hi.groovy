def call (Map config = [:]) {
sh "echo hello ${config.name}.today is ${config.day}"
}
