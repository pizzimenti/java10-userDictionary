import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static org.assertj.core.api.Assertions.assertThat;
import static org.fluentlenium.core.filter.FilterConstructor.*;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
      goTo("http://localhost:4567/");
      assertThat(pageSource()).contains("User Dictionary");
  }

  @Test
  public void addWordTest() {
    goTo("http://localhost:4567");
    fill("#word").with("sauna");
    fill("#definition").with("traditional Finnish bathhouse");
    submit("#addWord");
    assertThat(pageSource()).contains("sauna");
    assertThat(pageSource()).contains("traditional Finnish bathhouse");
  }

  @Test
  public void addDefTest() {
    goTo("http://localhost:4567");
    fill("#word").with("sauna");
    fill("#definition").with("traditional Finnish bathhouse");
    submit(".btn");
    click("button", withText("sauna"));
    fill("#addDefinition").with("the act of taking a sauna");
    assertThat(pageSource()).contains("sauna");
    assertThat(pageSource()).contains("traditional Finnish bathhouse");
    assertThat(pageSource()).contains("the act of taking a sauna");
  }

} // end IntegrationTest
