resolvers ++= Seq(
	"Typesafe Snapshots" at "http://repo.typesafe.com/typesafe/snapshots/",
	Resolver.sonatypeRepo("releases"),
	Resolver.sonatypeRepo("snapshots")
)
 
libraryDependencies ++= Seq(
  "org.scalaz" %% "scalaz-core" % "7.1.0",
  "com.chuusai" %% "shapeless" % "2.0.0"
)
 
initialCommands in console := "import scalaz._, Scalaz._"

incOptions := incOptions.value.withNameHashing(false)
