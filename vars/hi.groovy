def call (map config = [:]) {
sh "echo hello ${config.name}.today is ${config.day} 
}
