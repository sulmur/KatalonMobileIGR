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

Mobile.startExistingApplication(GlobalVariable.APP_EXIST, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Saldo Klik/Tombol Saldo'), 0)

Mobile.tap(findTestObject('Saldo Klik/Tarik Dana'), 0)

Mobile.tap(findTestObject('Saldo Klik/Tarik_Dana/Tarik Semua'), 0)

Mobile.tap(findTestObject('Saldo Klik/Tarik_Dana/Opsi Akun Bank 1'), 0)

Mobile.tap(findTestObject('Saldo Klik/Tarik_Dana/Tarik Dana'), 0)

if (true) {
    Mobile.tap(findTestObject(null), 0)
} else {
	Mobile.waitForElementPresent(findTestObject('Object Repository/Saldo Klik/Alert Tarik Saldo Gagal'), 0)
	Mobile.tap(findTestObject('Object Repository/Saldo Klik/Setuju Tarik Saldo Gagal'), 0)
}

