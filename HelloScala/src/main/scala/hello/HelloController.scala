package hello

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping

@RestController
class HelloWorldController () {
  @RequestMapping(Array("/"))
  def hello() : String = {
    return "Hello World"
  }
}
