# ComposerPractice

## Android Studio(2020.3.1 CANARY 8)が必要

https://developer.android.com/jetpack/compose/setup?hl=ja

## Composeの思想(宣言型 UI ツールキット)

https://developer.android.com/jetpack/compose/mental-model?hl=ja

## 宣言的UI x Android

https://tech.dely.jp/entry/2020/12/22/170000

## State/Props

https://qiita.com/rio_threehouse/items/7632f5a593cf218b9504

## ResourceManager

https://developer.android.com/studio/write/resource-manager?hl=ja#import

## 引数のエラー

デフォルト引数のない変数に値をセットする必要がある

## android:hoge 的なやつ

```Column(modifier = Modifier.padding(16.dp))```　みたいな

## 最新のバージョンだとサンプル通り動かない

preferredHeightとかはheightにリネームされていて、見つからない
```
Size modifiers were renamed. Modifier.width/height/size were renamed to requiredWidth/requiredHeight/requiredSize. Modifier.preferredWidth/preferredHeight/preferredSize were renamed to width/height/size.
```

imageResourceもalpha12でdeprecatedになった影響か知らんけどbeta01だと見つからない
```
loadFontResource is deprecated. Use fontResource instead. imageResource, loadImageResource, vectorResource, and loadVectorResource are deprecated. Use painterResource instead. (I6b809)
```
