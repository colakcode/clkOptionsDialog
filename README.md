# clkOptionsDialog

Easy Options Dialog for your Android app. Dialog window with three option buttons for simple requests you want to users in your Android applications.

### GetStarted

Step 1. Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

    dependencies {
	        implementation 'com.github.colakcode:clkOptionsDialog:v0.1.1'
	  }

### Screenshot
![OptionsDialog](https://github.com/colakcode/clkOptionsDialog/blob/master/media/options_dialog.png)


### Java Code
        OptionsDialog.showWithThreeOptions(activity, "Do you want to delete only this file or all your files?", "Delete", "Delete All", "Cancel", OptionsDialog.DialogGravity.BOTTOM );

or with just one option button<br/>

	OptionsDialog.showWithOneOption(activity, "Information window...", "Cancel", OptionsDialog.DialogGravity.CENTER );
	
with two option button<br/>

	OptionsDialog.showWithTwoOptions(activity, "Do you want to save this file?", "Save", "Cancel", OptionsDialog.DialogGravity.BOTTOM );
        
### Call buttons and set onClickMethod
        OptionsDialog.getButtonLeft().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OptionsDialog.dismiss();
                Toast.makeText(context, "Cancel", Toast.LENGTH_SHORT).show();
            }
        });

### Set Background Color
      OptionsDialog.setBackgroundColor(Color.BLUE);
      
### Other Options
You can choose many options such as background color, information text color and button text colors.
     
     OptionsDialog.setInfoTextColor(Color.BLACK);
     OptionsDialog.setAllButtonTextColor(Color.RED);
     
 Open dialog window **OptionsDialog.DialogGravity.BOTTOM**, ***.CENTER** or ***.TOP**
     
## Author
Kemal ÇOLAK [@colakcode](https://github.com/colakcode/) on GitHub

## License

The MIT License (MIT)

Copyright (c) 2020 Kemal ÇOLAK

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
