import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.awt.Color as Color
import java.util.concurrent.ConcurrentHashMap.KeySetView as KeySetView
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.android.AndroidKeyCode as AndroidKeyCode
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import org.openqa.selenium.Rectangle as Rectangle

Mobile.callTestCase(findTestCase('Search/TC_Search_Button'), [:], FailureHandling.STOP_ON_FAILURE)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

//Mobile.takeElementScreenshot(RunConfiguration.getReportFolder() + 'Field Search.png', findTestObject('Search/Field Search'), 
//    [findTestObject('Search/Keranjang Search')], Color.GREEN)
//Mobile.takeAreaScreenshot(RunConfiguration.getReportFolder() + 'Field Search.png', new Rectangle(0, 0, 1500, 1000), [findTestObject(
//            'Search/Back Search')], Color.BLUE)
'Tap field \'Search\''
Mobile.tap(findTestObject('Search/Field Search'), 10)

'Input data produk yang ingin dicari pada field \'Search\''
Mobile.setText(findTestObject('Search/Field Search'), 'cap badak', 10)

'Tap \'Enter\' pada keyboard'
driver.pressKeyCode(AndroidKeyCode.KEYCODE_ENTER)

Mobile.waitForElementPresent(findTestObject('Search/Sorting/Sort Button'), 0)

'Tap tombol \'Sort\''
Mobile.tap(findTestObject('Search/Sorting/Sort Button'), 0)

'Tap opsi \'Harga Termurah\''
Mobile.tap(findTestObject('Search/Sorting/Harga Termurah'), 0)

Mobile.waitForElementPresent(findTestObject('Promo Lebih Untung/Tambah Keranjang Asahi'), 0)

'Tap \'Tambah Keranjang\' pada produk Asahi Sardines'
Mobile.tap(findTestObject('Promo Lebih Untung/Tambah Keranjang Asahi'), 0)

Mobile.waitForElementPresent(findTestObject('Checkout/Tambah_Keranjang/Icon_Keranjang/Pop-up Harga Termurah'), 0)

Mobile.takeScreenshot(RunConfiguration.getReportFolder() + 'Pop-up Keranjang Lebih Untung.png', FailureHandling.CONTINUE_ON_FAILURE)

'Tap \'Tambah Keranjang\' pada detail produk Asahi Sardines'
Mobile.tap(findTestObject('Promo Lebih Untung/Pop-up Tambah Keranjang Asahi'), 0)

Mobile.waitForElementPresent(findTestObject('Search/Keranjang Search'), 0)

'Tap icon \'Keranjang\' pada laman Search'
Mobile.tap(findTestObject('Search/Keranjang Search'), 0)

Mobile.waitForElementPresent(findTestObject('Promo Lebih Untung/Tombol Mau Lebih Untung'), 0)

Mobile.takeScreenshot(RunConfiguration.getReportFolder() + 'Keranjang Lebih Untung.png', FailureHandling.CONTINUE_ON_FAILURE)

'Tap tombol \'Mau Lebih Untung\''
Mobile.tap(findTestObject('Promo Lebih Untung/Tombol Mau Lebih Untung'), 0)

Mobile.takeScreenshot(RunConfiguration.getReportFolder() + 'Detail Lebih Untung.png', FailureHandling.CONTINUE_ON_FAILURE)

'Tap tombol \'Tutup\' pada detail Mau Lebih Untung'
Mobile.tap(findTestObject('Promo Lebih Untung/Tutup Mau Lebih Untung'), 0)

Mobile.waitForElementPresent(findTestObject('Search/Keranjang/Hapus Produk/Hapus Produk 1'), 0)

Mobile.callTestCase(findTestCase('Search/TC_Hapus_Keranjang_Search'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

