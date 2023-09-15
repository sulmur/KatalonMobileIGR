import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

Mobile.tap(findTestObject('Checkout/Checkout/Tombol Checkout'), 0)

Mobile.takeScreenshot(RunConfiguration.getReportFolder() + 'Gagal Checkout.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Checkout/Pembayaran/Saldo Indogrosir'), 0)

'Aktifkan opsi \'Saldo Indogrosir\''
Mobile.tap(findTestObject('Checkout/Pembayaran/Saldo Indogrosir'), 0)

Mobile.takeScreenshot(RunConfiguration.getReportFolder() + 'Saldo Indogrosir.png', FailureHandling.CONTINUE_ON_FAILURE)

if (Mobile.verifyElementExist(findTestObject('Checkout/Pembayaran/VA BCA'), 0)) {
    'Tap tombol \'Pesan Ulang\''
    Mobile.tap(findTestObject('Checkout/Pembayaran/VA BCA'), 0, FailureHandling.OPTIONAL)
} else {
    'Pastikan opsi "VA BCA" tidak ada'
    Mobile.verifyElementNotExist(findTestObject('Checkout/Pembayaran/VA BCA'), 0, FailureHandling.CONTINUE_ON_FAILURE)
}

