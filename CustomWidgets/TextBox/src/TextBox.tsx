import { Component, Fragment, ReactNode, createElement } from "react";
import { Alert } from "./components/Alert";
import { hot } from "react-hot-loader/root";
import { TextBoxContainerProps } from "../typings/TextBoxProps";
import { TextInput } from "./components/TextInput";
import "./ui/TextBox.css";

class TextBox extends Component<TextBoxContainerProps> {
    private readonly onLeaveHandle = this.onLeave.bind(this);
    componentDidMount(): void {
        this.props.textAttribute.setValidator(this.validator.bind(this));
    }
    render(): ReactNode {
        const value = this.props.textAttribute.value || "";
        const validationFeedback = this.props.textAttribute.validation;
        const required = !!(this.props.requiredMessage && this.props.requiredMessage.value);
        return <Fragment>
            <TextInput
                id={this.props.id}
                value={value}
                style={this.props.style}
                className={this.props.class}
                tabIndex={this.props.tabIndex}
                disabled={this.isReadOnly()}
                onLeave={this.onLeaveHandle}
                required={required}
                hasError={!!validationFeedback}
            />
            <Alert id={this.props.id + "-error"}>{validationFeedback}</Alert>
        </Fragment>;
    }
    private isReadOnly(): boolean {
        return this.props.editable === "never" || this.props.textAttribute.readOnly;
    }
    private onLeave(value: string, isChanged: boolean): void {
        if (!isChanged) {
            return;
        }
        this.props.textAttribute.setValue(value);
    }
    private validator(value: string | undefined): string | undefined {
        const { requiredMessage } = this.props;
        if (requiredMessage && requiredMessage.value && !value) {
            return requiredMessage.value;
        }
        return;
    }
}
export default hot(TextBox);
