import java.io.File
import java.util.Scanner
import scala.io.Source

object ReadingFiles extends App{

  val filepath = "R:\\Scala.txt"
  val file = new File(filepath)
  val scanner = new Scanner(file)
  while(scanner.hasNextLine) {
    val line = scanner.nextLine()

    println(line)
  }

  val scalaFileContents: Iterator[String] = Source.fromFile(file).getLines()
  scalaFileContents.foreach(println)

}
