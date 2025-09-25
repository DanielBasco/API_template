package app.routes;

import io.javalin.apibuilder.EndpointGroup;

import static io.javalin.apibuilder.ApiBuilder.*;

public class Routes {
    //Ændre det til din egne routes
   // private PoemRoutes poemRoutes = new PoemRoutes();

    public EndpointGroup getRoutes(){
        return () -> {
            get("/", ctx -> ctx.result("Hej"));
            //Lav din egne paths
            //path("/poem", poemRoutes.getRoutes());
        };
    }

}