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

'Tap tombol "Simpan Perubahan"'
Mobile.tap(findTestObject('Profil/Ubah_Password/Simpan Ubah Password'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Object Repository/Profil/Ubah_Password/Ubah_Password_Null/android.view.View'), 
    0)

Mobile.verifyMatch('Password lama harus diisi', 'Password lama harus diisi', false)

Mobile.verifyElementVisible(findTestObject('Object Repository/Profil/Ubah_Password/Ubah_Password_Null/android.view.View (1)'), 
    0)

Mobile.verifyMatch('Password baru harus diisi', 'Password baru harus diisi', false)

Mobile.verifyElementVisible(findTestObject('Object Repository/Profil/Ubah_Password/Ubah_Password_Null/android.view.View (2)'), 
    0)

Mobile.verifyMatch('Password tidak sama diisi', 'Password tidak sama diisi', false)

Mobile.closeApplication()

