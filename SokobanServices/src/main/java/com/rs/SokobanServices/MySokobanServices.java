package com.rs.SokobanServices;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.rs.db.LevelAndSteps;
import com.rs.db.LevelAndStepsManager;
@Path("resources")
/**
 * web service to the sokoban services
 * @author Sapir Markel and Roee Sisso
 *
 */
public class MySokobanServices {
private LevelAndStepsManager dbHandler = new LevelAndStepsManager();
	@Path("get/{levelName}")
	@GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getSolution(@PathParam("levelName")String name) {
       String solution= dbHandler.getSolution(name);
    	   return solution;
   
		
    }
	/**
	 * update the data base with the solution
	 * @param name
	 * @param solution
	 * @return
	 */
	@GET
	@Path("/add/{levelName}/{moves}")
    public Response addSolution(@PathParam("levelName")String name,@PathParam("moves") String solution) {
		System.out.println(name);
		System.out.println(solution);
		LevelAndSteps sol = new LevelAndSteps(name, solution);
        dbHandler.addSolution(sol);
        System.out.println("responsessss");
      return Response.status(200).build();
    }
    
}
