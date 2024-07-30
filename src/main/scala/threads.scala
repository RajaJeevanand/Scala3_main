import threads.runnable

object threads extends App {

//  JVM Threads
  val runnable = new Runnable:
    override def run(): Unit =  println("Running the thread!")
}
  val aThreads = new Thread(runnable)
  aThreads.start()