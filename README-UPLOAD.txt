BhashaLive — Correct Android Project

Upload the CONTENTS of this folder to GitHub while preserving folders.
Do NOT upload only the ZIP and do NOT flatten the folders.

Required structure:
app/build.gradle
app/src/main/AndroidManifest.xml
app/src/main/assets/index.html
app/src/main/java/com/bhashalive/app/MainActivity.java
app/src/main/res/values/styles.xml
build.gradle
settings.gradle
.github/workflows/build.yml

After upload and commit:
GitHub -> Actions -> Build BhashaLive -> Run workflow.
After the run succeeds, open it and download BhashaLive-APK from Artifacts.

The app is a prototype. Production AI translation/API, privacy policy, signing and Play Store release configuration still need to be added.
