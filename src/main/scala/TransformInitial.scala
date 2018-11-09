import org.apache.spark.sql.SparkSession

// Extending App is more idiomatic than writing a "main" function.
object TransformInitial
extends App {

  val session = SparkSession.builder.master("local").appName("test").getOrCreate()

  // As of Spark 2.0, it's easier to read CSV files.
  val df = session.read.option("header", "true").option("inferSchema", "true").csv("data_sets/small_test.csv")
  df.show()

  // Shutdown gracefully.
  session.stop()
}