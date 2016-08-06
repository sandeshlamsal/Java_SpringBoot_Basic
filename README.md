# SpringBootBasic
This is the basic SpringBoot example clearing the basic concepts of autowired, componentscan for packages etc.

@RestController  //makes the controller as restconroller to be accessible with url
@Autowired   //will make instance of class without new keyword
@Component   //will make the class as component so that it can be autowired

//@RestController=@Controller + @RequestBody
//In springboot if you use @Controller only then need the view
//page should be in  /static folder and must have thymelef xml tag in .html page

//RestController is used to send the response in json or object format so @ResponseBody
//is used internally, remember use URL in return must not use @ResponseBody
//Ref: https://www.genuitec.com/spring-frameworkrestcontroller-vs-controller

//Beside of it : @EnableAutoConfiguration used in Application.java starter..

