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

'Tap field \'Nomor HP\''
Mobile.tap(findTestObject('Profil/Alamat_Penerima/Edit Alamat/Field Nomor HP Filled'), 0)

Mobile.clearText(findTestObject('Profil/Alamat_Penerima/Edit Alamat/Field Nomor HP Filled'), 0)

'Input data pada field \'Nomor HP\''
Mobile.setText(findTestObject('Profil/Alamat_Penerima/Tambah Alamat/Field Nomor HP'), '081808195603', 0)

Mobile.pressBack()

Mobile.swipe(100, 400, 0, 0)

Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

