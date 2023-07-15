import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class ArabamComTest {
    // Arabam kac para bolumune tiklayalim
    // Aracimin fiyatini merak ediyorum bolumune tiklayalim
    // Wolkswagen markasini secelim
    // yil secimi yapalim
    // model secimi yapalim
    // govde tipini secelim
    // yakit tipini secelim
    // vites tipini secelim
    // Versiyon secimi yapalim
    // aracin km bilgilerini girelim
    // aracin rengini secelim
    // opsiyonel donanim(varsa) secelim
    // degisen bilgisi ekleyerek tramer kaydi belirtelim
    // aracimizin fiyatinin 500.000 tl den fazla oldugunu test edelim
    // uygulamayi kapatalim

    @Test
    public void arabamTest(){

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 2");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");


    }

}
