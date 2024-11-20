package com.example.myandroidapplication.ui.theme.screens.signup

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun SignupScreen(navController: NavController){
    var email by remember {
        mutableStateOf(value = "")
    }
    var username by remember {
        mutableStateOf(value = "")
    }
    var password by remember {
        mutableStateOf(value = "")
    }
    var confirmpassword by remember {
        mutableStateOf(value = "")
    }



    Column {
        Text(text = "Register Here",
            fontSize = 20.sp,
            color = Color.White,
            fontFamily = FontFamily.SansSerif,
            fontStyle = FontStyle.Normal,
            textAlign = TextAlign.Center,
            modifier = androidx.compose.ui.Modifier
                .background(Color.Black)
                .padding(20.dp)
                .fillMaxWidth(),




        )

        Spacer(modifier = androidx.compose.ui.Modifier.height(10.dp))
        OutlinedTextField(
            value = username,
            onValueChange = {newUsername -> username = newUsername},
            label = { Text(text = "Enter your username") },
            placeholder = { Text(text = "Please enter your username") },
        )
        Spacer(modifier = androidx.compose.ui.Modifier.height(10.dp))
        OutlinedTextField(
            value = email,
            onValueChange = {newEmail -> email = newEmail},
            label = { Text(text = "Enter Email") },
            placeholder = { Text(text = "Please enter Email") },
        )
        Spacer(modifier = androidx.compose.ui.Modifier.height(10.dp))
        OutlinedTextField(
            value = password,
            onValueChange = {newPassword -> password = newPassword},
            label = { Text(text = "Enter Password") },
            placeholder = { Text(text = "Please enter Password") },
        )
        Spacer(modifier = androidx.compose.ui.Modifier.height(10.dp))
        OutlinedTextField(
            value = confirmpassword,
            onValueChange = {newConfirmpassword -> confirmpassword = newConfirmpassword},
            label = { Text(text = "Confirm Password") },
            placeholder = { Text(text = "Please enter  confirm Password") },
        )

    }


}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SignupScreenPreview(){
    SignupScreen(rememberNavController())
}