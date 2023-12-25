package ru.hh.lesson.examples.web;

import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.hh.lesson.model.Vacancy;

@Component
@Path("/v2/vacancy")
class VacancyResourceV2 {
  private final VacancyService vacancyService;

  @Autowired
  public VacancyResourceV2(VacancyService vacancyService) {
    this.vacancyService = vacancyService;
  }

  // GET /v2/vacancy/123
  @GET
  @Path("/{id}")
  public Vacancy getVacancy(@PathParam("id") Integer vacancyId) {
    return vacancyService.getVacancy(vacancyId);
  }

  // GET /v2/vacancy?employerId=123
  @GET
  public List<Vacancy> getVacancies(@QueryParam("employerId") Integer employerId) {
    return vacancyService.getAllVacanciesByEmployer(employerId);
  }

  // POST /v2/vacancy + тело запроса { "employerId": 123, "title": "Вакансия", ... }
  @POST
  public Vacancy createVacancy(Vacancy vacancy) {
    return vacancyService.createVacancy(vacancy);
  }

  // DELETE /v2/vacancy/123
  @DELETE
  @Path("/{id}")
  public void deleteVacancy(@PathParam("id") Integer vacancyId) {
    vacancyService.deleteVacancy(vacancyId);
  }
}

