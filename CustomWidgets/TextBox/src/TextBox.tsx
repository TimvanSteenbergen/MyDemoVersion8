import { Component, ReactNode, createElement } from "react";
import { hot } from "react-hot-loader/root";
import { TextBoxContainerProps } from "../typings/TextBoxProps";
import { TextInput } from "./components/TextInput";
import "./ui/TextBox.css";

class TextBox extends Component<TextBoxContainerProps> {
    render(): ReactNode {
        const value = this.props.textAttribute.value || "";
        return <TextInput value={value} />;
    }
}

export default hot(TextBox);
