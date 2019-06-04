import { Component, ReactNode, createElement } from "react";

export interface InputProps {
    value: string;
}

export class TextInput extends Component<InputProps> {
    render(): ReactNode {
        return <input type="text" value={this.props.value} />;
    }
}