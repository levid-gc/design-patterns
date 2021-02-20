# 责任链模式

_当你想要让一个以上的对象有机会能够处理某个请求的时候，就是用职责链模式（Chain of Responsibility Pattern）_。

## 参与者

- Handler
- ConcreteHandler
- Client

## 协作方式

## 如何使用责任链模式

通过责任链模式，你可以为某个请求创建一个对象链。每个对象依序检查此请求，并对其进行处理，或者将它传给链中的下一个对象。

## 责任链的优点

- 将请求的发送者和接受者解耦。
- 可以简化你的对象，因为它不需要知道链的结构。
- 通过改变链内的成员或调动它们的次序，允许你动态地新增或者删除责任。

## 责任链地用途和缺点

- 经常被使用在窗口系统中，处理鼠标和键盘之类的事件。
- DOM 结构中的事件冒泡。
- 错误处理 `try...catch`。
- ES `Promise` 对象（虽然标准的不提供错误类型重载，但是许多实现支持）。
- 并不保证请求一定会被执行；如果没有任何对象处理它的话，它可能会落到链尾端之外（这可以是优点也可以是缺点）。
- 可能不容易观察运行时的特征，有碍于除错。

_示例：try...catch_

```javascript
function foo() {
  let value = Math.random();

  if (value < 0.5) {
    throw new Error('Awesome error');
  } else if (value < 0.8) {
    throw new TypeError('Awesome typ error')；
  }
}

function bar() {
  try {
    foo();
  } catch (error) {
    if (error instanceof TypeError) {
      console.log('Some type error occurs', error);
    } else {
      throw error;
    }
  }
}

function biu() {
  try {
    bar();
  } catch (error) {
    console.log('Some error occurs', error);
  }
}
```

_示例： Promise_

```javascript
promise
  .catch(TypeError, reason => {
    // handle TypeError.
  })
  .catch(ReferenceError, reason => {
    // handle ReferenceError.
  })
  .catch(reason => {
    // handle other errors.
  });
```