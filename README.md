# DevSecOps Android Java



## GitHub Actions

- 拉取分支
  - Repository
    - https://github.com/actions/checkout
  - Marketplace
    - https://github.com/marketplace/actions/checkout
- 程式碼掃描(Android 或 iOS)
  - Repository
    - https://github.com/MobSF/mobsfscan
  - Marketplace
    - https://github.com/marketplace/actions/mobsfscan
- 上傳掃描結果報告到GitHub
  - https://docs.github.com/en/code-security/code-scanning/integrating-with-code-scanning/uploading-a-sarif-file-to-github

## 掃描分析

- gradle套件相依報表

  project-report

- 靜態分析Java

  [SpotBugs](https://github.com/spotbugs)

  執行 gradle spotbugsRelease

## 測試

- JUnit 5
- Robolectric
- JaCoCo 產生Test覆蓋率報表

## 編譯發布

- assembleRelease
