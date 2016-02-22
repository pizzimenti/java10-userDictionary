import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";
    Dictionary userDict = new Dictionary();

    get("/", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView (model, layout);
    }, new VelocityTemplateEngine());

    post("/", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");

      String newWord = request.queryParams("word");
      String newDefinition = request.queryParams("definition");
      Word newWordObject = new Word(newWord, newDefinition);
      // model.put("lastWordAdded", newWordObject.get(0));
      userDict.add(newWordObject);
      model.put("allWords", userDict.getWordList());

      return new ModelAndView (model, layout);
    }, new VelocityTemplateEngine());

  } //end of Main
} //end of App
