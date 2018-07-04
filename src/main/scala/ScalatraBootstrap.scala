import com.bdir.back.app.routes.RouteServlets
import org.scalatra._
import javax.servlet.ServletContext

class ScalatraBootstrap extends LifeCycle with RouteServlets {

  override def init(context: ServletContext) {
    routes.foreach { route =>
       context.mount(route._2, route._1)
    }
  }
}
